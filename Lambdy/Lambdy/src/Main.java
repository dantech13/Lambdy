public class Main {

    public static void main(String[] args) {

        UserValidator validator = new UserValidator();

        // Reguły walidacji
        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8);
        validator.addRule(form -> form.age() >= 18);

        // Poprawny formularz
        UserForm form1 = new UserForm(
                "anna@example.com",
                "bezpieczne123",
                20
        );

        // Niepoprawny formularz
        UserForm form2 = new UserForm(
                "janexample.com",
                "123",
                15
        );

        System.out.println("Formularz 1 poprawny: "
                + validator.isValid(form1));

        System.out.println("Formularz 2 poprawny: "
                + validator.isValid(form2));
    }
}