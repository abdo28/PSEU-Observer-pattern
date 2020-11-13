public class BlogPost {
    private String Username;
    private String Title;
    private String Body;
    private String PostDate;
    private int ID;


    public String getUsername() {
        return Username;
    }

    public String getTitle() {
        return Title;
    }

    public String getBody() {
        return Body;
    }

    public String getPostDate() {
        return PostDate;
    }

    public int getID() {
        return ID;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setBody(String body) {
        Body = body;
    }

    public void setPostDate(String postDate) {
        PostDate = postDate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public BlogPost(String username, String title, String body, String postDate, int ID){
        this.Username=username;
        this.Title=title;
        this.Body=body;
        this.PostDate=postDate;
        this.ID = ID;
    }
}
