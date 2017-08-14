package top.leeklong.model;/**
 * Created by pc on 2017/8/14.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 菜单表
 *
 * @author lee
 * @create 2017-08-14 9:56
 **/
public class Menu {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "id", strategy = "native")
    @GeneratedValue(generator = "id")
    @Column(name="id", length = 32)
    private Long id;
    @Column(name = "parent_id",length = 32)
    private Long parentId;

    @Column(name = "menu_view_name",length = 64)
    private String menuViewName;

    @Column(name = "menu_dict_name",length = 64)
    private String menuDictName;

    @Column(name = "level")
    private Integer level;

    @Column(name = "level_view_name",length = 64)
    private String levelViewName;

    @Column(name = "menu_project",length = 64)
    private String menuProject;

    @Column(name = "menu_status")
    private Integer menuStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMenuViewName() {
        return menuViewName;
    }

    public void setMenuViewName(String menuViewName) {
        this.menuViewName = menuViewName;
    }

    public String getMenuDictName() {
        return menuDictName;
    }

    public void setMenuDictName(String menuDictName) {
        this.menuDictName = menuDictName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelViewName() {
        return levelViewName;
    }

    public void setLevelViewName(String levelViewName) {
        this.levelViewName = levelViewName;
    }

    public String getMenuProject() {
        return menuProject;
    }

    public void setMenuProject(String menuProject) {
        this.menuProject = menuProject;
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }
}
