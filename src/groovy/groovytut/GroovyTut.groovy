package groovy.groovytut;

class GroovyTut {

    static void main(String[] args) {

       /* println('I am ${name}\n'); //Literal
        println("I am ${name}\n");

        println("3rd Index of Name " + name[3]);
        println("Index of r " + name.indexOf('r'));

        println("1st 3 chars " + name[0..2]);

        printf("A %s string \n", name);*/

        sayHello();

        def getFactorial = {num -> (num <= 1 ? 1 : num * call(num -1))}
        println(getFactorial(4))


    }

    static def sayHello(){
        println("Say Hello");
    }

    static def getSum(num1, num2){
        return num1 + num2;
    }

    static def factorial(num) {

        if(num <= 1){
            return 1;
        } else {
            return (num * factorial(num -1));
        }
    }
}
