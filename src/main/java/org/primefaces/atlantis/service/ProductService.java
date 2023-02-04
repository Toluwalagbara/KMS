/*
   Copyright 2009-2022 PrimeTek.

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.primefaces.atlantis.service;

import org.primefaces.atlantis.domain.InventoryStatus;
import org.primefaces.atlantis.domain.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Named
@ApplicationScoped
public class ProductService {

    List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1000, "f230fh0g3", "Benjamin Apevihin", "Lack of awareness", "avatar.png", 65, "Trader", 24, InventoryStatus.NATIONAL, 5, "Training Successful", "Traning & practise","Module completed","Benue Project Report", "Jun 21", "Dec 21", "Weekly report", "Engage with state team", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1001, "nvklal433", "Abechi Janet", "Health", "avatar3.png", 72, "Farmer", 61, InventoryStatus.STATE, 4, "Training Successful", "Traning & practise", "Module completed", "Edo Project Report", "Jan 22", "Jun 22", "Monthly report", "Engage with local team", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1002, "zz21cz3c1", "David Alabi", "Transportation", "avatar.png", 79, "Driver", 2, InventoryStatus.LGA, 3, "Training Successful", "Traning & practise", "Module completed", "Lagos Project Report", "Jul 22", "Dec 22", "Weekly report", "Send emails to coordinators", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1003, "244wgerg2", "Edoh Amedu", "No skill", "avatar3.png", 29, "Teacher", 25, InventoryStatus.NATIONAL, 5, "Training Successful", "Traning & practise", "Module completed", "Ogun Project Report", "Jan 23", "Jun 23", "Monthly report", "Create more report", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1004, "h456wer53", "Godwin Gabriel", "Lack of capital", "avatar.png", 15, "Farmer", 73, InventoryStatus.NATIONAL, 4, "Training Successful", "Traning & practise", "Module completed", "Nasarawa Project Report", "Jul 23", "Dec 23", "Weekly report", "Create more report", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1005, "av2231fwg", "Mary Philip", "No skill", "avatar3.png", 120, "Butcher", 0, InventoryStatus.STATE, 4, "Training Successful", "Traning & practise", "Module completed", "Edo Project Report", "Jul 21", "Dec 21", "Monthly report", "Engage with local team", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1006, "bib36pfvm", "Innocent Ankel", "Lack of capital", "avatar.png", 32, "Hunter", 5, InventoryStatus.LGA, 3, "Training Successful", "Traning & practise", "Module completed", "Lagos Project Report", "Jan 22", "Jun 22", "Weekly report", "Engage with state team", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1007, "mbvjkgip5", "James Agani", "Transportation", "avatar3.png", 34, "Driver", 23, InventoryStatus.NATIONAL, 5, "Training Successful", "Traning & practise", "Module completed", "Benue Project Report", "Jul 22", "Dec 22", "Monthly report", "Engage with local team", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1008, "vbb124btr", "Edoh Amedu", "Language", "avatar.png", 99, "Farmer", 2, InventoryStatus.LGA, 4, "Training Successful", "Traning & practise","Module completed", "Nasarawa Project Report", "Jan 23", "Jun 23", "Weekly report", "Send emails to coordinators", "Changed strategy to incoperate more participants", "none"));
        products.add(new Product(1009, "cm230f032", "Bawa Rachel", "Health", "avatar3.png", 299, "Teacher", 63, InventoryStatus.NATIONAL, 3, "Training Successful", "Traning & practise", "Module completed", "Ogun Project Report", "Jan 23", "Jun 23", "Monthly report", "Engage with state team", "Changed strategy to incoperate more participants", "none"));
//        products.add(new Product(1010, "plb34234v", "Gold Phone Case", "Product Description", "gold-phone-case.jpg", 24, "Accessories", 0, InventoryStatus.STATE, 4));
//        products.add(new Product(1011, "4920nnc2d", "Green Earbuds", "Product Description", "green-earbuds.jpg", 89, "Electronics", 23, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1012, "250vm23cc", "Green T-Shirt", "Product Description", "green-t-shirt.jpg", 49, "Clothing", 74, InventoryStatus.NATIONAL, 5));
//        products.add(new Product(1013, "fldsmn31b", "Grey T-Shirt", "Product Description", "grey-t-shirt.jpg", 48, "Clothing", 0, InventoryStatus.STATE, 3));
//        products.add(new Product(1014, "waas1x2as", "Headphones", "Product Description", "headphones.jpg", 175, "Electronics", 8, InventoryStatus.LGA, 5));
//        products.add(new Product(1015, "vb34btbg5", "Light Green T-Shirt", "Product Description", "light-green-t-shirt.jpg", 49, "Clothing", 34, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1016, "k8l6j58jl", "Lime Band", "Product Description", "lime-band.jpg", 79, "Fitness", 12, InventoryStatus.NATIONAL, 3));
//        products.add(new Product(1017, "v435nn85n", "Mini Speakers", "Product Description", "mini-speakers.jpg", 85, "Clothing", 42, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1018, "09zx9c0zc", "Painted Phone Case", "Product Description", "painted-phone-case.jpg", 56, "Accessories", 41, InventoryStatus.NATIONAL, 5));
//        products.add(new Product(1019, "mnb5mb2m5", "Pink Band", "Product Description", "pink-band.jpg", 79, "Fitness", 63, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1020, "r23fwf2w3", "Pink Purse", "Product Description", "pink-purse.jpg", 110, "Accessories", 0, InventoryStatus.STATE, 4));
//        products.add(new Product(1021, "pxpzczo23", "Purple Band", "Product Description", "purple-band.jpg", 79, "Fitness", 6, InventoryStatus.LGA, 3));
//        products.add(new Product(1022, "2c42cb5cb", "Purple Gemstone Necklace", "Product Description", "purple-gemstone-necklace.jpg", 45, "Accessories", 62, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1023, "5k43kkk23", "Purple T-Shirt", "Product Description", "purple-t-shirt.jpg", 49, "Clothing", 2, InventoryStatus.LGA, 5));
//        products.add(new Product(1024, "lm2tny2k4", "Shoes", "Product Description", "shoes.jpg", 64, "Clothing", 0, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1025, "nbm5mv45n", "Sneakers", "Product Description", "sneakers.jpg", 78, "Clothing", 52, InventoryStatus.NATIONAL, 4));
//        products.add(new Product(1026, "zx23zc42c", "Teal T-Shirt", "Product Description", "teal-t-shirt.jpg", 49, "Clothing", 3, InventoryStatus.LGA, 3));
//        products.add(new Product(1027, "acvx872gc", "Yellow Earbuds", "Product Description", "yellow-earbuds.jpg", 89, "Electronics", 35, InventoryStatus.NATIONAL, 3));
//        products.add(new Product(1028, "tx125ck42", "Yoga Mat", "Product Description", "yoga-mat.jpg", 20, "Fitness", 15, InventoryStatus.NATIONAL, 5));
//        products.add(new Product(1029, "gwuby345v", "Yoga Set", "Product Description", "yoga-set.jpg", 20, "Fitness", 25, InventoryStatus.NATIONAL, 8));

    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProducts(int size) {

        if (size > products.size()) {
            Random rand = new Random();

            List<Product> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(products.size());
                randomList.add(products.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(products.subList(0, size));
        }

    }

    public List<Product> getClonedProducts(int size) {
        List<Product> results = new ArrayList<>();
        List<Product> originals = getProducts(size);
        for (Product original : originals) {
            results.add(original.clone());
        }
        return results;
    }
}
