package data.models;

import data.repositries.Items;

import java.util.ArrayList;

//    private Reciever reciever;
//      private Sender sender;

    public class Item {
        private int packageId;
        private String name;
        private String description;
        private int weightInGrams;




        public void setWeightInGrams(int weightInGrams) {
            this.weightInGrams = weightInGrams;
        }



        public void setDescription(String description) {
            this.description = description;
        }

        //        public Item(int id, String name, String description, int weightInGrams) {
//            this.id = id;
//            this.name = name;
//            this.description = description;
//            this.weightInGrams = weightInGrams;
//        }
        public int getId() {
            return packageId;
        }
        public void setId(int id) {
            this.packageId = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDescription() {
            return description;
        }

        public int getWeightInGrams() {
            return weightInGrams;
        }

        public int getPackageId() {
            return packageId;
        }
        private int generatePackageId() {
            int key = 0;
            return ++key;
        }


    }

