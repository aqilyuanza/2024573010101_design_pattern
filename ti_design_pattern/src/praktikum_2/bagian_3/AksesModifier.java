package praktikum_2.bagian_3;

public class AksesModifier {
        public int publicVar = 1;
        private int privateVar = 2;
        protected int protectedVar = 3;
        int defaultVar = 4;
        public void tampilkan() {
            System.out.println("Public: " + publicVar);
            System.out.println("private: " + privateVar);
            System.out.println("protected: " + protectedVar);
            System.out.println("Default: "+ defaultVar);
        }
    }
