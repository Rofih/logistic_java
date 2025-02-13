package data.models;

import data.repositries.Items;

import java.util.ArrayList;

//    private Reciever reciever;
//      private Sender sender;

    public class Item {
        private int id;
        private String name;
        private String description;
        private int weightInGrams;

        public Item(int id, String name, String description, int weightInGrams) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.weightInGrams = weightInGrams;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
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
    }

