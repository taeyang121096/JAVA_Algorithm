public interface RunMath {
    int doIt(int number);
    default int dod(){
        System.out.println("dfdf");
        return 1;
    }

}
