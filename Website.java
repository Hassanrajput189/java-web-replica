import java.util.ArrayList;
import java.util.Scanner;
class Blog {
    protected String title;
    protected String author;
    protected String description;
    protected String content;
    protected String publicationDate;

    public Blog(String title, String author, String description, String content, String publicationDate) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
}

class BlogWebsite  {
    protected Website w;
    protected ArrayList<Blog> blogList;

    public BlogWebsite(Website w) {
        this.w = w;
        this.blogList = new ArrayList<>();
    }
    void giveLikes(long likes) {
        w.giveLikes(likes);
    }

    void giveComments(String comments){
        w.giveComments(comments);
    }
    long getLikes(){
        return (w.getLikes());
    }
    String getComments(){
        return (w.getComments());
    }
    void addBlog(Blog blog) {
        blogList.add(blog);
    }
    void removeBlog(int index) {
        if (index >= 0 && index < blogList.size()) {
            blogList.remove(index);
            System.out.println("Blog removed");
        } else {
            System.out.println("Invalid index. Blog not removed.");
        }
    }
    
    void displayBlog() {
        for (int i = 0;i<blogList.size();i++) {
            System.out.println("Blog " + (i+1));
            System.out.println("Title: " + blogList.get(i).getTitle());
            System.out.println("Author: " + blogList.get(i).getAuthor());
            System.out.println("Description: " + blogList.get(i).getDescription());
            System.out.println("Content: " + blogList.get(i).getContent());
            System.out.println("Date of Publication: " + blogList.get(i).getPublicationDate());
            if(w.likes != 0){
                System.out.println("Website Likes : "+w.getLikes());
            }
            if(w.comments != null){
                System.out.println("Website Comments : "+w.getComments());
            }
        }
    }
}
class Project{
    protected String title;
    protected String description;
    protected String type;
    protected String githubLink;
    protected String dateOfCreation;
    Project(String title,String description,String type,String githubLink,String dateOfCreation){
        this.title = title;
        this.description = description;
        this.type = type;
        this.githubLink = githubLink;
        this.dateOfCreation = dateOfCreation;
    }

    
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getType(){
        return type;
    }
    public String getGithubLink(){
        return githubLink;
    }
    public String getDateOfCreation(){
        return dateOfCreation;
    }
}
class PortfolioWebsite{
    protected Website w;
    ArrayList <Project> pjList;
    protected String ownerName;
    protected String project;
    protected int noOfProjects = 0;
    public PortfolioWebsite(Website w) {
        this.w=w;
        this.ownerName = ownerName;
        this.project = project;
        this.pjList = new ArrayList<>();
    }


    void giveLikes(long likes) {
        w.giveLikes(likes);
    }

    void giveComments(String comments){
        w.giveComments(comments);
    }

    String getOwnername(){
        return ownerName;
    }
    String getProject(){
        return project;
    }
    int getNoOfProjects(){
        return noOfProjects;
    }
    public void addProjects(Project pj){
        pjList.add(pj);
        noOfProjects++;
    }
    void removeProject(int index) {
        if (index >= 0 && index < pjList.size()) {
            pjList.remove(index);
            System.out.println("Blog removed");
        } else {
            System.out.println("Invalid index. Blog not removed.");
        }
    }
    public void displayProjects(){
        for(Project pjt:pjList){
            System.out.println("Title : "+pjt.getTitle());
            System.out.println("Description : "+pjt.getDescription());
            System.out.println("Type : "+pjt.getType());
            System.out.println("GitHub Link : "+pjt.getGithubLink());
            System.out.println("Date of Creation : "+pjt.getDateOfCreation());
            if(w.likes != 0){
                System.out.println("Website Likes : "+w.getLikes());
            }
            if(w.comments != null){
                System.out.println("Website Comments : "+w.getComments());
            }
        }
    }
}
 class Product {
    protected String productId;
    protected String productName;
    protected long productPrice;
    protected int productStock; 
    protected String productDescription; 
    public Product(String productId, String productName, long productPrice, int productStock, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
class E_CommerceWebsite {
    protected Website w;
    protected ArrayList<Product> productList;
    protected int noOfProducts = 0;
    public E_CommerceWebsite(Website w) {
        this.w = w;
        this.productList = new ArrayList<>();
    }


    void giveLikes(long likes) {
        w.giveLikes(likes);
    }

    void giveComments(String comments){
        w.giveComments(comments);
    }
    
    long getLikes(){
        return (w.getLikes());
    }
    String getComments(){
        return (w.getComments());
    }
    void addProduct(Product p) {
        productList.add(p);
        noOfProducts++;
    }
    void removeProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            productList.remove(index);
            System.out.println("Blog removed");
        } else {
            System.out.println("Invalid index. Blog not removed.");
        }
    }
    
    void displayProducts() {
        for (Product pt : productList) {
            System.out.println("Product : " + (noOfProducts));
            System.out.println("Product ID : " + pt.getProductId());
            System.out.println("Product Name : " + pt.getProductName());
            System.out.println("Product Price : " + pt.getProductPrice());
            System.out.println("Product Stock : " + pt.getProductStock());
            System.out.println("Product Description :  " + pt.getProductDescription());
            if(w.likes != 0){
                System.out.println("Website Likes : "+w.getLikes());
            }
            if(w.comments != null){
                System.out.println("Website Comments : "+w.getComments());
            }
        }
    }

}
class LoadingWebsiteThread extends Thread {
    private String websiteName;

    public LoadingWebsiteThread(String websiteName) {
        this.websiteName = websiteName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("https://www." + websiteName + ".com (Loading..."+i+")" );
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        System.out.println(websiteName + " loaded!");
    }
}

public class Website {
    protected String domainName;
    protected String URL;
    protected String category;
    protected String contactNumber;
    protected String contactEmail;
    protected String database;   
    protected long likes;
    protected String comments;
    private Admin admin;
    public Website(String domainName,String URL,String category,String contactNumber,String contactEmail,String database){
        this.domainName = domainName;
        this.URL = URL;
        this.category = category;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
        this.database = database;
        admin = new Admin("hassanrajput189@gmail.com", "hassanrajput");
    }
    public String getDomain(){
        return domainName;
    }
    public String getURL(){
        return URL;
    }
    public String getCatagory(){
        return category;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public String getContactEmail(){
        return contactEmail;
    }
    public String getDatabase(){
        return database;
    }
    public void giveLikes(long likes) {
        this.likes = likes;
    }
    public void giveComments(String comments){
        this.comments = comments;
    }
    public long getLikes(){
        return likes;
    }
    public String getComments(){
        return comments;
    }
    public void displayWebsiteInfo(){
        System.out.println("Domain Name : " + domainName);
        System.out.println("Website URL : " + URL);
        System.out.println("Category : " + category);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Contact Email : " + contactEmail);
        System.out.println("DataBase : " + database);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose;
        long likes;
        int choice;
        String input = "yes";
        String email,password;
        while(input.equalsIgnoreCase("yes")){ 
        Blog b1 = new Blog("My Blog 1","Hassan Rajput","This is the first blog","This is a default blog for the user","15/10/2023");
        Blog b2 = new Blog("My Blog 2","Hassan Rajput","This is the second blog","This is a default blog for the user","15/10/2023");
        Blog b3 = new Blog("My Blog 3","Hassan Rajput","This is the third blog","This is a default blog for the user","15/10/2023");
        Project pj1 = new Project("My Project 1", "Hassan Rajput", "This is the first Project", "This is a default project for the user", "15/10/2023");
        Project pj2 = new Project("My Project 2", "Hassan Rajput", "This is the second Project", "This is a default project for the user", "15/10/2023");
        Project pj3 = new Project("My Project 3", "Hassan Rajput", "This is the third Project", "This is a default project for the user", "15/10/2023");
        Product pd1 = new Product("01","Laptop",200000, 19, "Default product for the user");
        Product pd2 = new Product("02", "Monitor", 10000, 37, "Default product for the user");
        Product pd3 = new Product("03 ", "Mobile", 7000000,73 , "Default product for the user");
 
        System.out.println("Enter the type of website (blog, portfolio, ecommerce):");
        String websiteType = sc.next();

        if (websiteType.equalsIgnoreCase("blog")) {
            System.out.println("Enter the name of your blog Webste");
            String name = sc.next();
            System.out.println("Enter your Contact number");
            String cn = sc.next();
            System.out.println("Enter your Contact E-mail");
            String em = sc.next();
            System.out.println("Enter the name of DataBase your webste uses");
            String db = sc.next();
            Website web = new Website(name, "https://"+name+".com", "Blogging",cn, em, db);
            BlogWebsite blogWebsite = new BlogWebsite(web);
            blogWebsite.addBlog(b1);
            blogWebsite.addBlog(b2);
            blogWebsite.addBlog(b3);
            LoadingWebsiteThread loadingWebThread = new LoadingWebsiteThread(web.getDomain());
            loadingWebThread.start();

            try {
                loadingWebThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Are you an admin? (yes/no)");
            choose = sc.next();

            if (choose.equalsIgnoreCase("yes")) {
                System.out.println("Enter admin email:");
                 email = sc.next();
                System.out.println("Enter admin password:");
                 password = sc.next();

                if (email.equals("hassanrajput189@gmail.com") && password.equals("hassanrajput")) {
                    System.out.println("Admin authentication successful.");
                    System.out.println("You can now add or remove content as an admin.");

                    while (true) {
                        System.out.println("Enter Blog Title:");
                        String title = sc.next();
                        System.out.println("Enter Author:");
                        String author = sc.next();
                        System.out.println("Enter Description:");
                        String description = sc.next();
                        System.out.println("Enter Content:");
                        String content = sc.next();
                        System.out.println("Enter Publication Date:");
                        String publicationDate = sc.next();
                        Blog newBlog = new Blog(title, author, description, content, publicationDate);
                        blogWebsite.addBlog(newBlog);

                    
                        blogWebsite.displayBlog();
                        System.out.println("Do you want to add another blog? (yes/no)");
                        String addAnotherBlog = sc.next();
                        if (!addAnotherBlog.equalsIgnoreCase("yes")) {
                            System.out.println("The blogs you created are");
                            blogWebsite.displayBlog();
                            System.out.println("Do you want to remove any blog(yes/no)");
                            choose = sc.next();
                            if(choose.equalsIgnoreCase("yes")){
                                System.out.println("Enter the index of the blog you want to remove");
                                choice = sc.nextInt();
                                blogWebsite.removeBlog(choice-1);
                                blogWebsite.displayBlog();
                            }
                            break; 
                        }
                    }
                } else {
                    System.out.println("Admin authentication failed. You can only view the website.");
                }
            } else {
                    System.out.println("Please create an account");
                    System.out.println("Enter Your E-mail");
                    email = sc.next();
                    System.out.println("Enter your Password");
                    password = sc.next();
                    blogWebsite.displayBlog();
                    System.out.println("Please rate the website");
                    System.out.print("Likes : ");
                    likes = sc.nextLong();                    
                    blogWebsite.giveLikes(likes);
                    System.out.print("Comments : ");
                    choose = sc.nextLine();
                    blogWebsite.giveComments(choose);
                    blogWebsite.displayBlog();
            }
        }
        
        else if (websiteType.equalsIgnoreCase("portfolio")) {
            System.out.println("Enter the name of your portfolio Website");
            String name = sc.next();
            System.out.println("Enter your Contact number");
            String cn = sc.next();
            System.out.println("Enter your Contact E-mail");
            String em = sc.next();
            System.out.println("Enter the name of Database your website uses");
            String db = sc.next();
            Website web = new Website(name, "https://"+name+".com", "Portfolio", cn, em, db);
            PortfolioWebsite portfolioWebsite = new PortfolioWebsite(web);
            portfolioWebsite.addProjects(pj1);
            portfolioWebsite.addProjects(pj2);
            portfolioWebsite.addProjects(pj3);
            LoadingWebsiteThread loadingWebThread = new LoadingWebsiteThread(web.getDomain());
            loadingWebThread.start();
        
            try {
                loadingWebThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            System.out.println("Are you an admin? (yes/no)");
            choose = sc.next();
        
            if (choose.equalsIgnoreCase("yes")) {
                System.out.println("Enter admin email:");
                email = sc.next();
                System.out.println("Enter admin password:");
                password = sc.next();
        
                if (email.equals("hassanrajput189@gmail.com") && password.equals("hassanrajput")) {
                    System.out.println("Admin authentication successful.");
                    System.out.println("You can now add or remove content as an admin.");
        
                    while (true) {
                        System.out.println("Enter Project Title:");
                        String title = sc.next();
                        System.out.println("Enter Description:");
                        String description = sc.next();
                        System.out.println("Enter Type:");
                        String type = sc.next();
                        System.out.println("Enter Date of Creation:");
                        String dateOfCreation = sc.next();
                        Project newProject = new Project(title, description, type, "https://www.GitHub.com/"+title, dateOfCreation);
                        portfolioWebsite.addProjects(newProject);
        
                        portfolioWebsite.displayProjects();
                        System.out.println("Do you want to add another project? (yes/no)");
                        String addAnotherProject = sc.next();
                        if (!addAnotherProject.equalsIgnoreCase("yes")) {
                            System.out.println("The projects you created are");
                            portfolioWebsite.displayProjects();
                            System.out.println("Do you want to remove any project? (yes/no)");
                            choose = sc.next();
                            if(choose.equalsIgnoreCase("yes")){
                                System.out.println("Enter the index of the project you want to remove");
                                choice = sc.nextInt();
                                portfolioWebsite.removeProject(choice-1);
                                portfolioWebsite.displayProjects();
                            }
                            break;
                        }
                    }
                } else {
                    System.out.println("Admin authentication failed. You can only view the website.");
                }
            } else {
                System.out.println("Please create an account");
                System.out.println("Enter Your E-mail");
                email = sc.next();
                System.out.println("Enter your Password");
                password = sc.next();
                portfolioWebsite.displayProjects();
                System.out.println("Please rate the website");
                System.out.print("Likes : ");
                likes = sc.nextLong();
                portfolioWebsite.giveLikes(likes);
                System.out.print("Comments : ");
                choose = sc.nextLine();
                portfolioWebsite.giveComments(choose);
                portfolioWebsite.displayProjects();
            }
        }
        
        else if (websiteType.equalsIgnoreCase("ecommerce")) {
            System.out.println("Enter the name of your E-Commerce Website");
            String name = sc.next();
            System.out.println("Enter your Contact number");
            String cn = sc.next();
            System.out.println("Enter your Contact E-mail");
            String em = sc.next();
            System.out.println("Enter the name of Database your website uses");
            String db = sc.next();
            Website web = new Website(name, "https://"+name+".com", "E-Commerce", cn, em, db);
            E_CommerceWebsite ecommerceWebsite = new E_CommerceWebsite(web);
            ecommerceWebsite.addProduct(pd1);
            ecommerceWebsite.addProduct(pd2);
            ecommerceWebsite.addProduct(pd3);
            LoadingWebsiteThread loadingWebThread = new LoadingWebsiteThread(web.getDomain());
            loadingWebThread.start();
        
            try {
                loadingWebThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            System.out.println("Are you an admin? (yes/no)");
            choose = sc.next();
        
            if (choose.equalsIgnoreCase("yes")) {
                System.out.println("Enter admin email:");
                email = sc.next();
                System.out.println("Enter admin password:");
                password = sc.next();
        
                if (email.equals("hassanrajput189@gmail.com") && password.equals("hassanrajput")) {
                    System.out.println("Admin authentication successful.");
                    System.out.println("You can now add or remove content as an admin.");
        
                    while (true) {
                        System.out.println("Enter Product ID:");
                        String productId = sc.next();
                        System.out.println("Enter Product Name:");
                        String productName = sc.next();
                        System.out.println("Enter Product Price:");
                        long productPrice = sc.nextLong();
                        System.out.println("Enter Product Stock:");
                        int productStock = sc.nextInt();
                        System.out.println("Enter Product Description:");
                        String productDescription = sc.next();
                        Product newProduct = new Product(productId, productName, productPrice, productStock, productDescription);
                        ecommerceWebsite.addProduct(newProduct);
        
                        ecommerceWebsite.displayProducts();
                        System.out.println("Do you want to add another product? (yes/no)");
                        String addAnotherProduct = sc.next();
                        if (!addAnotherProduct.equalsIgnoreCase("yes")) {
                            System.out.println("The products you created are");
                            ecommerceWebsite.displayProducts();
                            System.out.println("Do you want to remove any product? (yes/no)");
                            choose = sc.next();
                            if(choose.equalsIgnoreCase("yes")){
                                System.out.println("Enter the index of the product you want to remove");
                                choice = sc.nextInt();
                                ecommerceWebsite.removeProduct(choice - 1);
                                ecommerceWebsite.displayProducts();
                            }
                            break;
                        }
                    }
                } else {
                    System.out.println("Admin authentication failed. You can only view the website.");
                }
            } else {
                System.out.println("Please create an account");
                System.out.println("Enter Your E-mail");
                email = sc.next();
                System.out.println("Enter your Password");
                password = sc.next();
                ecommerceWebsite.displayProducts();
                System.out.println("Please rate the website");
                System.out.print("Likes : ");
                likes = sc.nextLong();
                ecommerceWebsite.giveLikes(likes);
                System.out.print("Comments : ");
                choose = sc.nextLine();
                ecommerceWebsite.giveComments(choose);
                ecommerceWebsite.displayProducts();
            }
        }
        
      else {
        System.out.println("Website not found 404!");
      }
        System.out.println("Search for Another Website(yes/no)");
        input = sc.next();
        } 
    }
}
