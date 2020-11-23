public class Patient extends Person {
    protected String id;
    protected Integer age;
    protected Date accepted;
    protected History sickness;
    protected String prescription;
    protected String allergies;
    protected String specialReqs;

    OperationsStaff staff1  = new OperationsStaff();
}