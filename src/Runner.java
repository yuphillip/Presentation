public class Runner {

    public static void main(String[] args) {

        TimeInterval one = new TimeInterval(9,11);
        TimeInterval two = new TimeInterval(9,11);

        Appointment OneA=new Appointment(one);
        Appointment TwoB=new Appointment(two);

        System.out.println(OneA.conflictsWith(TwoB));
        DailySchedule Calender = new DailySchedule();

        System.out.print(Calender.addAppt(OneA,true));
     
    }
}
