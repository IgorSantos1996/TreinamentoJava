package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> listadecomments = new ArrayList<>();
    // não fazemos o método set da lista, e sim o add e remove na lista

    public Post() {

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getListadecomments() {
        return listadecomments;
    }

    public void AddComment(Comment comment) {
        listadecomments.add(comment);
    }

    public void RemoveComment(Comment comment) {
        listadecomments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        // permite concatenar outras strings usando o método append
        sb.append(title + "\n");
        sb.append(likes);
        sb.append("Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        // para cada item na minha lista de comentários
        for (Comment item : listadecomments)
            // add os comentarios no string builder
            sb.append(item.getText());
        return sb.toString();
    }

}
