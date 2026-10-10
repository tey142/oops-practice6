import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

abstract class item{
    private String id;
    private String title;
    private LocaDate pd;
    private int maxcd;
    public item(String id, String title, LocalDate pd, int maxcd){
        this.id=id;
        this.title=title;
        this.pd=pd;
        this.maxcd=maxcd;
    }
    public String getid(){
        return id;
    }
    public String title(){
        return title;
    }
    public LocalDate pd(){
        return pd;
    }
    public int maxcd(){
        return maxcd;
    }
}
class book extends item{
    private String author;
    private int pn;
    public book(String id, String title, LocalDate pd, int maxcd, String author, int pn){
        super(id, title, pd, maxcd);
        this.author=author;
        this.pn=pn;
    }
    public String getauthor(){
        return author;
    }
    public int getpn(){
        return pn;
    }
}
class cd extends item{
    private String artists;
    private int tracks;
    public cd(String id, String title, LocalDate pd, int maxcd, String artists, int tracks){
        super(id, title, pd, maxcd);
        this.artists=artists;
        this.tracks=tracks;
    }
    public String artists(){
        return artists;
    }
    public int tracks(){
        return tracks;
    }
}
class dvd extends item{
    
}