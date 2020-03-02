package sample;

import javafx.collections.ObservableList;

public class Inventory {
    private static ObservableList<Part> allParts;
    private static ObservableList<Part> allProducts;

    public static void addPart(Part newPart){

    }

    public static void addProduct(Product newProduct){

    }

    public static Part lookupPart(int partId){

        return null;
    }

    public static Product lookupProduct(int productId){

        return null;
    }

    public static ObservableList<Part> lookupPart(String partName){
        return null;
    }


    public static ObservableList<Product> lookupProduct(String partName){
        return null;
    }

    public static void updatePart(int index, Product newPart){

    }

    public static void updateProduct(int index, Product newProduct){

    }

    public static boolean deletePart(Part selectedPart){
        return false;
    }

    /**
     * Attempts to delete selectedProduct.
     * @param selectedProduct
     * @return If it worked or not
     */
    public static boolean deleteProduct(Part selectedProduct){
        return false;
    }

    public static ObservableList<Part> getAllParts(){
        return null;
    }

    public static ObservableList<Product> getAllProducts(){
        return null;
    }




}
