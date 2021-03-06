/*
 * Copyright (C) 2013 Ustream Inc.
 * author chaotx <lombai.ferenc@ustream.tv>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */
package com.robin.utilities.config;

public class ConfigurationFileNotFoundException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public ConfigurationFileNotFoundException(final String filename)
    {
        super(String.format("Configuration file not found: %s", filename));
    }

}
