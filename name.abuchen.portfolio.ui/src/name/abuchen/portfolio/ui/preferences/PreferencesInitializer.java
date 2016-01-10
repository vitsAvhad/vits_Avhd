package name.abuchen.portfolio.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import name.abuchen.portfolio.ui.PortfolioPlugin;
import name.abuchen.portfolio.ui.UIConstants;

public class PreferencesInitializer extends AbstractPreferenceInitializer
{
    @Override
    public void initializeDefaultPreferences()
    {
        IPreferenceStore store = PortfolioPlugin.getDefault().getPreferenceStore();
        store.setDefault(UIConstants.Preferences.AUTO_UPDATE, true);
        store.setDefault(UIConstants.Preferences.UPDATE_SITE, "http://updates.abuchen.name/portfolio"); //$NON-NLS-1$
        store.setDefault(UIConstants.Preferences.USE_INDIRECT_QUOTATION, true);
    }
}
