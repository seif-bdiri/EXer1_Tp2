public class testt {
    public static void main(String[] args) {
        livree l1=new livree(123,"nabil","memories",56900);
        System.out.println(l1.getId());
        l1.tooString();
        System.out.println("l auteur est: "+l1.getAuteur());
        l1.setAuteur("samir");
        System.out.println("le nouveau auteur est: "+l1.getAuteur());
    }
}
