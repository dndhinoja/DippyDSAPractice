package com.dn.application.LeetCode.CollectionSorting;

public class FruitComparable implements Comparable<FruitComparable>{

        private int id;
        private String fruitName;
        private String colour;

        public FruitComparable(int id, String fruitName, String colour) {
            this.id = id;
            this.fruitName = fruitName;
            this.colour = colour;
        }

        public int getId() {
            return id;
        }

        public String getFruitName() {
            return fruitName;
        }

        public String getColour() {
            return colour;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FruitComparable that = (FruitComparable) o;
            return id == that.id && fruitName.equals(that.fruitName) && colour.equals(that.colour);
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = result*31 + id;
            result = result*31 + fruitName.hashCode();
            result = result*31 + colour.hashCode();
            return result;
            //return Objects.hash(id, fruitName, colour);
        }

        @Override
        public int compareTo(FruitComparable fruitComparable) {
            //return this.compareTo(fruitComparable);
            //return this.fruitName.compareTo(fruitComparable.fruitName);
        if(this.hashCode()==fruitComparable.hashCode())
            return 0;
        else if(this.hashCode()>fruitComparable.hashCode())
            return 1;
        else
          return -1;
        }
}
