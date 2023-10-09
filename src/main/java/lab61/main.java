package lab61;

/*
 * note the bad coding style (deliberately written for debugging exercise)
 */
public class main {
    public static void main(String[] args) {
        Animal animals[] = new Animal[10];
        for (int i=0;i<10;i++)
            animals[i] = new Animal();
        for (int iii = 0; iii < 10; iii++) {
            int ii = 0;
            for (; ii < 100 && animals[iii].isAlive() ; ii++) {
                System.out.print(animals[iii].getWeight() + " ");
                animals[iii].eat();
                if (ii % 3 == 0)
                    animals[iii].poo();
            }
        }
    }
}

//the bug is at line 9 and line 10
//the Animal a cannot read the item in animals thus it can not help the animals array to initialize the item
//instead of use a to read the item just simply use the item in the array directly to initialize it
//then the buy is solved