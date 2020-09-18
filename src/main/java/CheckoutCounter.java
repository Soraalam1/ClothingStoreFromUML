public class CheckoutCounter {


    public static void main(String[] args) {
        ShopApp shopApp = new ShopApp();

        Clothing jeans = new Clothing("Blue Jeans", 20, 'M');
        Clothing tShirt = new Clothing("White T Shirt", 5.0,'S');
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, 'L');

        Clothing[] shoppingBag1 = new Clothing[3];

        shoppingBag1[0] = jeans;
        shoppingBag1[1] = tShirt;
        shoppingBag1[2] = buttonUp;

        Clothing[] shoppingBag2 = new Clothing[1];
        Clothing hat = new Clothing("A nice hat", 100,'M');
        shoppingBag2[0] = hat;

        Customer Dean = new Customer("Dean", shoppingBag2);
        shopApp.measure(Dean);
        //I made the measuring random btw

        Employee John = new Employee("John", shoppingBag1);
        shopApp.measure(John);

        Customer[] lineOfCustomers = new Customer[2];
        lineOfCustomers[0] = Dean;
        lineOfCustomers[1] = John;


        for(int currentCustomer = 0; currentCustomer < lineOfCustomers.length; currentCustomer++){
            System.out.println("***********************WELCOME**********************");
            System.out.println("Hello " + lineOfCustomers[currentCustomer].getName() +  ", welcome to the clothing store!"+
            " We measured you and your size is " + lineOfCustomers[currentCustomer].getSize() + "." + "\n"
                    + "We will scan your items now: ");
            for(int item = 0; item < lineOfCustomers[currentCustomer].getClothingItems().length; item++){
                System.out.println(lineOfCustomers[currentCustomer].getClothingItems()[item].itemInfo());
                System.out.println("Does it fit: " + lineOfCustomers[currentCustomer].getClothingItems()[item].isAFit(lineOfCustomers[currentCustomer]));
            }
            double subtotal = shopApp.calcTotal(lineOfCustomers[currentCustomer].getClothingItems());
            System.out.println("Your subtotal is: $" + subtotal);
            double employeeDiscountIfNeeded = shopApp.employeePriceAfterDisc(subtotal);

            if(lineOfCustomers[currentCustomer] instanceof Employee){
                System.out.println("You are an employee, your subtotal with discount applied is: " + employeeDiscountIfNeeded);
                double finalEmployeeTotal = shopApp.calcTax(employeeDiscountIfNeeded);
                System.out.println("Your total with tax applied is: $" + finalEmployeeTotal);
                System.out.println("**********************Thank you, come again!*********************" + "\n" + "\n");
            }
            else{
                double finalCustomerTotal = shopApp.calcTax(subtotal);
                System.out.println("Your total with tax applied is: $" + finalCustomerTotal);
                System.out.println("**********************Thank you, come again!*********************" + "\n" + "\n");
            }
        }
    }
}
