package top.leeklong.model;/**
 * Created by pc on 2017/8/14.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 功能API中间表
 *
 * @author lee
 * @create 2017-08-14 17:00
 **/
public class MenuApi {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "id", strategy = "native")
    @GeneratedValue(generator = "id")
    @Column(name="id", length = 32)
    private Long id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="api_id", columnDefinition = "char(32) COMMENT 'APIid'")
    private Api api;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="menu_id", columnDefinition = "char(32) COMMENT '菜单id'")
    private Menu menu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
