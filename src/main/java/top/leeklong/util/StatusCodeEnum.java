package top.leeklong.util;


import org.apache.commons.lang3.StringUtils;

/**
 * WSJStatusCodeEnum callback code
 * 
 * @author kayson Yang
 * @date 2016/9/19 0017
 */
public enum StatusCodeEnum {



	CODE_0(0, "成功"),
	CODE_1(1, "缺少必选参数"),
	CODE_3(3, "密码重置成果，登陆异常"),
	CODE_10001(10001, "两次输入的密码不一致"),
	CODE_10002(10002, "注册验证码已过期"),
	CODE_10003(10003, "验证码错误"),
	CODE_10004(10004, "数据库数据持久层发生错误"),
	CODE_10005(10005, "手机号不合法"),
	CODE_2(2, "系统发生错误"),
	CODE_10006(10006, "缓存数据发生错误"),
	CODE_10007(10007, "手机号已被注册"),
	CODE_10008(10008, "用户不存在"),
	CODE_10009(10009, "用户密码为空"),
	CODE_10010(10010, "原密码输入错误"),
	CODE_10011(10011, "获取缓存数据发生异常"),
	CODE_10012(10012, "获取微信openId失败"),
	CODE_10013(10013, "该用户未绑定微信openId"),
	CODE_10014(10014, "用户名或密码错误");



	private int code;
	private String msg;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	StatusCodeEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public static StatusCodeEnum getByCode(int code) {
		if (StringUtils.isNotBlank(String.valueOf(code))) {
			for (StatusCodeEnum e : values()) {
				if (e.code == code) {
					return e;
				}
			}
		}
		return null;
	}

	/**
	 * override toString ，method print personal filed
	 */
	@Override
	public String toString() {
		return super.toString() + ">>" + JsonUtil.json2String(this);
	}
}
