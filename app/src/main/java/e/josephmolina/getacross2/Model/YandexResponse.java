package e.josephmolina.getacross2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class YandexResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("text")
    @Expose
    private List<String> text = null;

    public YandexResponse(Integer code, String lang, List<String> text) {
        this.code = code;
        this.lang = lang;
        this.text = text;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
}
