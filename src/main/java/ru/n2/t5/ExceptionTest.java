package ru.n2.t5;

public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println();
        System.out.print("1. ");
//        _125();

        System.out.println();
        System.out.print("2. ");
        _12567();

        System.out.println();
        System.out.print("3. ");
//        _1345();

        System.out.println();
        System.out.print("4. ");
        _134567();

        System.out.println();
        System.out.print("5. ");
//        _135();

        System.out.println();
        System.out.print("6. ");
//        _1356();

        System.out.println();
        System.out.print("7. ");
//        _15();

        System.out.println();
        System.out.print("8. ");
        _156();


    }

    private static void _125() {
        try {
            System.out.print(1);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _12567() {
        try {
            System.out.print(1);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
//                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _1345() {
        try {
            System.out.print(1);
            if (true) {
                throw new NullPointerException();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _134567() {
        try {
            System.out.print(1);
            if (true) {
                throw new NullPointerException();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
//                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _135() {
        try {
            System.out.print(1);
            if (true) {
                throw new NullPointerException();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _1356() {
        try {
            System.out.print(1);
            if (true) {
                throw new NullPointerException();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
//                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _15() {
        try {
            System.out.print(1);
            if (true) {
                throw new Error();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }
    private static void _156() {
        try {
            System.out.print(1);
            if (true) {
                throw new Error();
            }
            System.out.print(2);
        } catch (RuntimeException e) {
            System.out.print(3);
            if (true) {
//                throw new NullPointerException();
            }
            System.out.print(4);

        } finally {
            System.out.print(5);
            if (true)
//                throw new NullPointerException();
            System.out.print(6);
        }
        System.out.print(7);
    }


}
