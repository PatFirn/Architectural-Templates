/**
 */
package org.palladiosimulator.architecturaltemplates.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.palladiosimulator.architecturaltemplates.util.ArchitecturaltemplatesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ArchitecturaltemplatesItemProviderAdapterFactory extends ArchitecturaltemplatesAdapterFactory
        implements ComposeableAdapterFactory, IChangeNotifier {

    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ArchitecturaltemplatesItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.AT} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ATItemProvider atItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.architecturaltemplates.AT}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createATAdapter() {
        if (this.atItemProvider == null) {
            this.atItemProvider = new ATItemProvider(this);
        }

        return this.atItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.Catalog} instances. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CatalogItemProvider catalogItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.architecturaltemplates.Catalog}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCatalogAdapter() {
        if (this.catalogItemProvider == null) {
            this.catalogItemProvider = new CatalogItemProvider(this);
        }

        return this.catalogItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.Role} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected RoleItemProvider roleItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.architecturaltemplates.Role}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createRoleAdapter() {
        if (this.roleItemProvider == null) {
            this.roleItemProvider = new RoleItemProvider(this);
        }

        return this.roleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.OCLConstraint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OCLConstraintItemProvider oclConstraintItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.OCLConstraint}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createOCLConstraintAdapter() {
        if (this.oclConstraintItemProvider == null) {
            this.oclConstraintItemProvider = new OCLConstraintItemProvider(this);
        }

        return this.oclConstraintItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.QVTOCompletion} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QVTOCompletionItemProvider qvtoCompletionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.QVTOCompletion}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createQVTOCompletionAdapter() {
        if (this.qvtoCompletionItemProvider == null) {
            this.qvtoCompletionItemProvider = new QVTOCompletionItemProvider(this);
        }

        return this.qvtoCompletionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMBlackboardCompletionParameterItemProvider pcmBlackboardCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMBlackboardCompletionParameterAdapter() {
        if (this.pcmBlackboardCompletionParameterItemProvider == null) {
            this.pcmBlackboardCompletionParameterItemProvider = new PCMBlackboardCompletionParameterItemProvider(this);
        }

        return this.pcmBlackboardCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMTemplateCompletionParameterItemProvider pcmTemplateCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMTemplateCompletionParameterAdapter() {
        if (this.pcmTemplateCompletionParameterItemProvider == null) {
            this.pcmTemplateCompletionParameterItemProvider = new PCMTemplateCompletionParameterItemProvider(this);
        }

        return this.pcmTemplateCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMOutputCompletionParameterItemProvider pcmOutputCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMOutputCompletionParameterAdapter() {
        if (this.pcmOutputCompletionParameterItemProvider == null) {
            this.pcmOutputCompletionParameterItemProvider = new PCMOutputCompletionParameterItemProvider(this);
        }

        return this.pcmOutputCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.ReconfigurationFolder} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ReconfigurationFolderItemProvider reconfigurationFolderItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.ReconfigurationFolder}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createReconfigurationFolderAdapter() {
        if (this.reconfigurationFolderItemProvider == null) {
            this.reconfigurationFolderItemProvider = new ReconfigurationFolderItemProvider(this);
        }

        return this.reconfigurationFolderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IsolatedPCMTemplateCompletionParameterItemProvider isolatedPCMTemplateCompletionParameterItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createIsolatedPCMTemplateCompletionParameterAdapter() {
        if (this.isolatedPCMTemplateCompletionParameterItemProvider == null) {
            this.isolatedPCMTemplateCompletionParameterItemProvider = new IsolatedPCMTemplateCompletionParameterItemProvider(
                    this);
        }

        return this.isolatedPCMTemplateCompletionParameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.PCMFileExtension} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMFileExtensionItemProvider pcmFileExtensionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.PCMFileExtension}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createPCMFileExtensionAdapter() {
        if (this.pcmFileExtensionItemProvider == null) {
            this.pcmFileExtensionItemProvider = new PCMFileExtensionItemProvider(this);
        }

        return this.pcmFileExtensionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.architecturaltemplates.GenericFileExtension} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GenericFileExtensionItemProvider genericFileExtensionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.architecturaltemplates.GenericFileExtension}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createGenericFileExtensionAdapter() {
        if (this.genericFileExtensionItemProvider == null) {
            this.genericFileExtensionItemProvider = new GenericFileExtensionItemProvider(this);
        }

        return this.genericFileExtensionItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

}
