package com.griddynamics.nchmiel.javafundamentals.interviewreview;


    class Human {

    }
    class Man extends Human {

    }
    class Woman extends Human {

    }

    public class God {
        public static Human[] create() {
            Human[] humans = new Human[2];
            humans[0] = new Man();
            humans[1] = new Woman();
            return humans;
        }
        public static void main (String[] args) {
            Human[] humans = create();

            System.out.println(humans[0].getClass().getSimpleName()); // Should print "Man"
            System.out.println(humans[1].getClass().getSimpleName()); // Should print "Man"

        }
    }

//code
