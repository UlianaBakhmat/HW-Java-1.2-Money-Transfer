public class main {
        public static void main(String[] args) {
            int current_deposit = 2_000_000_000;
            int incoming_transfer = 500_000_000;
            int deposit_new = current_deposit + incoming_transfer;
            System.out.println("Текущий баланс: " + deposit_new);
    }
}
