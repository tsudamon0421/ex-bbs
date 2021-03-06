package com.example.form;

/**
 * コメント情報を受け取るフォームクラス.
 * 
 * @author hikaru.tsuda
 *
 */
public class CommentForm {

	/** 記事ID */
	private String articleId;
	/** コメント者名 */
	private String name;
	/** コメント内容 */
	private String content;

	@Override
	public String toString() {
		return "CommentForm [articleId=" + articleId + ", name=" + name + ", content=" + content + "]";
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
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
