/** Copyright (c) 2012 Memorial Sloan-Kettering Cancer Center.
**
** This library is free software; you can redistribute it and/or modify it
** under the terms of the GNU Lesser General Public License as published
** by the Free Software Foundation; either version 2.1 of the License, or
** any later version.
**
** This library is distributed in the hope that it will be useful, but
** WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
** MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
** documentation provided hereunder is on an "as is" basis, and
** Memorial Sloan-Kettering Cancer Center 
** has no obligations to provide maintenance, support,
** updates, enhancements or modifications.  In no event shall
** Memorial Sloan-Kettering Cancer Center
** be liable to any party for direct, indirect, special,
** incidental or consequential damages, including lost profits, arising
** out of the use of this software and its documentation, even if
** Memorial Sloan-Kettering Cancer Center 
** has been advised of the possibility of such damage.  See
** the GNU Lesser General Public License for more details.
**
** You should have received a copy of the GNU Lesser General Public License
** along with this library; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
**/

// package
package org.mskcc.cbio.importer;

// imports
import javax.sql.DataSource;

/**
 * Interface used to create database/database schema dynamically.
 */
public interface DatabaseUtils {

	/**
	 * Returns the database user credential.
	 *
	 * @return String
	 */
    public String getDatabaseUser();

	/**
	 * Returns the database password credential.
	 *
	 * @return String
	 */
    public String getDatabasePassword();

	/**
	 * Returns the database connection string.
	 *
	 * @return String
	 */
    public String getDatabaseConnectionString();

	/**
	 * Returns the importer database name.
	 *
	 * @return String
	 */
    public String getImporterDatabaseName();

	/**
	 * Returns the gene information database name.
	 *
	 * @return String
	 */
    public String getGeneInformationDatabaseName();

	/**
	 * Returns the portal database name.
	 *
	 * @return String
	 */
    public String getPortalDatabaseName();

    /**
	 * Creates a database and optional schema.
	 * 
	 * @param databaseName String
	 * @param createSchema boolean
	 */
	void createDatabase(final String databaseName, final boolean createSchema);
}