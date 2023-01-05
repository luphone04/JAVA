package oocpyoutube;


//Access Modifier is a keyword that is used to define the scope of a class, method, constructor, or variable.
//In Java, there are four types of access modifiers:
//1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
//3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
//4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

// You can use these word in front of classes , variables, methods, and constructors
//In other word "security";


//                  Class  Package Subclass World
//        public      Y       Y       Y       Y
//        protected   Y       Y       Y       N
//        no modifier Y       Y       N       N
//        private     Y       N       N       N

public class accessmodifier {
     public void display(){ // default access modifier
        System.out.println("Hello World");

    }


}
