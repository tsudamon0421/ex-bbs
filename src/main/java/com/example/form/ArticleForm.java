package com.example.form;

/**
 * 記事情報を受け取るフォームクラス.
 * 
 * @author hikaru.tsuda
 *
 */
public class ArticleForm {
	
	/**	投稿者名 */
	private String name;
	/**	投稿内容 */
	private String content;
	
	@Override
	public String toString() {
		return "ArticleForm [name=" + name + ", content=" + content + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
