/**
 */
package ttc2019.live.bibtex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2019.live.bibtex.TitledEntry#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see ttc2019.live.bibtex.BibtexPackage#getTitledEntry()
 * @model abstract="true"
 * @generated
 */
public interface TitledEntry extends BibTeXEntry {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ttc2019.live.bibtex.BibtexPackage#getTitledEntry_Title()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ttc2019.live.bibtex.TitledEntry#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // TitledEntry
