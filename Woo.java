public class Woo extends Zoo {
        public String one() {
            return "wee" + this.two();
        }
        public String extra() {
            return "eek" + super.one();
        }
    }
