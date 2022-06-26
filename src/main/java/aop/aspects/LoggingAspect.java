package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    public void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    public void combinePointcuts(){}
//
//    @Before("combinePointcuts()")
//    public void beforeCombinePointcuts(){
//        System.out.println("beforeCombinePointcutsAdvice: Log1");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get* ())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return* ())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writting Log1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writting Log2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnMLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writting Log3");
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

       MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = "+ methodSignature);
        System.out.println("methodSignature.getMethod = "+methodSignature.getMethod());
        System.out.println("methodSignature.returnType = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName = "+methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for (Object obj : arguments){
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " + myBook.getName() +"," +
                    "автор - " + myBook.getAuthor() + " , год публикации - " + myBook.getPublicationYear());
                }

                else if (obj instanceof String) System.out.println("Книгу в библиотеку добавил " + obj);
            }
        }

        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------------");
    }






}
