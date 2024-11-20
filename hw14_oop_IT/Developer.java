package hw14_oop_IT;

abstract public class Developer extends ITworker {
        private String [] listOfIDE;
        public Developer(String fullName) {
            super(fullName);
        }

        public void usesIDE() {
            System.out.print("IDE:");
            for (String ide : listOfIDE) {
                System.out.print(ide+" ");
            }
        }
        public void setIDE(String[] listOfIDE) {
            this.listOfIDE = listOfIDE;
        }

        abstract boolean doHealthCheck();

    }