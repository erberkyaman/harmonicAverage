public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5, 6, 7 , 8 ,9};
        double harmonicSeries=0.0;
        double harmonicAverage=0.0;

        for(int i=1; i <= numbers.length; i++){
            harmonicSeries+=1/i;
    }
        harmonicAverage = numbers.length / harmonicSeries;
        System.out.println("Dizinin Harmonik Serisi : "+harmonicSeries);
        System.out.println("Dizinin Harmonik Ortalaması : "+harmonicAverage);

    }
}
