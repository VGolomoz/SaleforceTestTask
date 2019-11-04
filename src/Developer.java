public class Developer extends Employee {

    private Double bonuses;

    public Developer(Double ratePerHour, Integer workdays, Double bonuses) {
        super(ratePerHour, workdays);
        this.bonuses = bonuses;
    }

    public Double getBonuses() {
        return bonuses;
    }

    public void setBonuses(Double bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    Double getSalary() {
        return super.getSalary() + bonuses;
    }
}

