public class CurrencyConverter {
        public static double price;
        public static double qty;

        public static double calculate(){
            return price * qty + (price * qty * 0.06);
        }

}
