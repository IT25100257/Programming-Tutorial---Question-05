// Calculator class with the required methods
class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to square a number (number × number)
    public int square(int num) {
        return num * num;
        // Alternative: return multiply(num, num);
    }
}

    public static void main(String[] args) {
        
        // Create an object of Calculator class
        Calculator calc = new Calculator();
        
        // Expression 1: (3 * 4 + 5 * 7)^2
        System.out.println("Expression 1: (3 * 4 + 5 * 7)^2");
        
        int part1 = calc.multiply(3, 4);          
        int part2 = calc.multiply(5, 7);          
        int sum1  = calc.add(part1, part2);       
        int result1 = calc.square(sum1);         
        
        System.out.println("Result = " + result1);
        System.out.println();
        
        
        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        System.out.println("Expression 2: (4 + 7)^2 + (8 + 3)^2");
        
        int sumA = calc.add(4, 7);               
        int sqA  = calc.square(sumA);             
        
        int sumB = calc.add(8, 3);                
        int sqB  = calc.square(sumB);             
        
        int result2 = calc.add(sqA, sqB);         
        
        System.out.println("Result = " + result2);

    }
