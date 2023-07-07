package xianmu;

public class book {
    private String name;
    private String writer;
    private int number;

    public book() {
    }

    public book(String name, String writer, int number) {
        this.name = name;
        this.writer = writer;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "图书{" + "书名：'" + name + '\'' + ", 作者：'" + writer + '\'' + ", 数量：" + number + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof book) {
            book user = (book) obj;
            boolean flag = this.name.equals(user.name);
            return flag;
        }
        return false;
    }
}
