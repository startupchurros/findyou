package br.com.startup.churros.findyou;

public class EnrollVO {

	private String image;;
	private String subject_id;
	private String gallery_name;
	private String selector;
	private String symmetricFill;

	public EnrollVO() {
		super();
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public String getGallery_name() {
		return gallery_name;
	}

	public void setGallery_name(String gallery_name) {
		this.gallery_name = gallery_name;
	}

	public String getSelector() {
		return selector;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	public String getSymmetricFill() {
		return symmetricFill;
	}

	public void setSymmetricFill(String symmetricFill) {
		this.symmetricFill = symmetricFill;
	}

}
