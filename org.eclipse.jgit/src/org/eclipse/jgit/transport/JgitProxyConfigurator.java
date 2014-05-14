package org.eclipse.jgit.transport;

import java.net.ProxySelector;

public class JgitProxyConfigurator {

	private static ProxySelector pSelector;

	public static void setProxySelector(ProxySelector ps) {
		pSelector = ps;
	}

	public static void removeProxySelector() {
		pSelector = null;
	}

	public static ProxySelector getDefault() {
		if (pSelector != null) {
			return pSelector;
		}
		return ProxySelector.getDefault();
	}

}
