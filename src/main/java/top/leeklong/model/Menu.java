package top.leeklong.model;/**
 * Created by pc on 2017/8/14.
 */

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

    private Long id;

    private Long parentId;

    private String menuViewName;

    private String menuDictName;

    private Integer level;

    private String levelViewName;

    private String menuProject;

    private String menuStatus;

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

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }
}
