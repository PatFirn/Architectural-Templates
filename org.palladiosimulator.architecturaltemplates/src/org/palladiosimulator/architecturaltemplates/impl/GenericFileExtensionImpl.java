/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.GenericFileExtension;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Generic File
 * Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.GenericFileExtensionImpl#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericFileExtensionImpl extends FileExtensionImpl implements GenericFileExtension {

    /**
     * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFileExtension()
     * @generated
     * @ordered
     */
    protected static final String FILE_EXTENSION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GenericFileExtensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.GENERIC_FILE_EXTENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getFileExtension() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.GENERIC_FILE_EXTENSION__FILE_EXTENSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFileExtension(final String newFileExtension) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.GENERIC_FILE_EXTENSION__FILE_EXTENSION, newFileExtension);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION__FILE_EXTENSION:
            return this.getFileExtension();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION__FILE_EXTENSION:
            this.setFileExtension((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION__FILE_EXTENSION:
            this.setFileExtension(FILE_EXTENSION_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION__FILE_EXTENSION:
            return FILE_EXTENSION_EDEFAULT == null ? this.getFileExtension() != null
                    : !FILE_EXTENSION_EDEFAULT.equals(this.getFileExtension());
        }
        return super.eIsSet(featureID);
    }

} // GenericFileExtensionImpl
