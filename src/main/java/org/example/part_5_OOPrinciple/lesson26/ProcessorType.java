package org.example.part_5_OOPrinciple.lesson26;

public enum ProcessorType implements Describable, Printable {
    BIT_32("32 bit architecture") {
        @Override
        public String getDescription() {
            return "32 bid description";
        }
    },
    BIT_64("64 bit architecture") {
        @Override
        public String getDescription() {
            return "64 bit description";
        }
    };

    private String title;

    ProcessorType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println(this.getDescription());
    }
}
