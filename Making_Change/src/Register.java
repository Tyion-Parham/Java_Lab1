import java.util.Scanner;


public class Register {
    // Main class responsible for
    public static void main(String[] args) {
        System.out.println("Enter an amount of money in the purse: ");
        Scanner sc = new Scanner(System.in);
        Purse lady;
        lady = makeChange(sc.nextDouble());
        System.out.println(lady.outputString());

    }

    public static Purse makeChange (double amt){
        Integer tempnum;
        Purse p = new Purse();
        Denomination hundred = new Denomination("hundred-dollar note", 100);
        Denomination fifty = new Denomination("fifty-dollar note", 50);
        Denomination twenty = new Denomination("twenty-dollar note", 20);
        Denomination ten = new Denomination("ten-dollar note", 10);
        Denomination five = new Denomination("five-dollar note", 5);
        Denomination one = new Denomination("one-dollar note", 1);
        Denomination quarter = new Denomination("quarter", .25);
        Denomination dime = new Denomination("dime", .1);
        Denomination nickel = new Denomination("nickel", .05);
        Denomination penny = new Denomination("penny", .01);

        while (amt > 0.005){
            tempnum = 0;
            if (amt >= 100){
                while (amt >= 100){
                    tempnum++;
                    amt -= 100;
                }
                p.addToPurse(hundred, tempnum);
            } else if (amt >= 50) {
                while (amt >= 50){
                    tempnum++;
                    amt -= 50;
                }
                p.addToPurse(fifty, tempnum);
            }else if (amt >= 20){
                while (amt >= 20){
                    tempnum++;
                    amt -= 20;
                }
                p.addToPurse(twenty, tempnum);
            }else if (amt >= 10){
                while (amt >= 10){
                    tempnum++;
                    amt -= 10;
                }
                p.addToPurse(ten, tempnum);
            }else if (amt>= 5){
                while (amt >= 5){
                    tempnum++;
                    amt -= 5;
                }
                p.addToPurse(five, tempnum);
            }else if (amt >= 1){
                while (amt >= 1){
                    tempnum++;
                    amt -= 1;
                }
                p.addToPurse(one, tempnum);
            }else if (amt >= .25){
                while (amt >= .25){
                    tempnum++;
                    amt -= .25;
                }
                p.addToPurse(quarter, tempnum);
            }else if (amt >= .1){
                while (amt >= .1){
                    tempnum++;
                    amt -= .1;
                }
                p.addToPurse(dime, tempnum);
            }else if (amt >= .05){
                while (amt >= .05){
                    tempnum++;
                    amt -= .05;
                }
                p.addToPurse(nickel, tempnum);
            }else if (amt >= .005){
                while (amt >= .005){
                    tempnum++;
                    amt -= .01;
                }
                p.addToPurse(penny, tempnum);
            }
        }
        return p;
    }

}