/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nc.adriens.schemacrawler.plugin.neo4j;

import org.neo4j.graphdb.RelationshipType;

/**
 *
 * @author salad74
 */
public enum SchemaRelationShips implements RelationshipType {
    IS_COLUMN_OF_TABLE
}
