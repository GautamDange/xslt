<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/WBBDLD07/IDOC">

{
"items":[ 	<xsl:for-each select="E1WBB01">      	{
		"LOCNR":<xsl:value-of select="	LOCNR	"/> ,
		"MATNR":<xsl:value-of select="	MATNR	"/> , 
		"GLTAB":<xsl:value-of select="	GLTAB	"/> ,
		"AENKZ":<xsl:value-of select="	AENKZ	"/> ,
		"SPRAS":<xsl:value-of select="	SPRAS	"/> ,
		"WAERS":<xsl:value-of select="	WAERS	"/> ,
		"BSORT":<xsl:value-of select="	BSORT	"/> }
 		<xsl:if test="position() != last()">
         		<xsl:text>,</xsl:text>
        </xsl:if>
      	</xsl:for-each>	
]
}
  </xsl:template>
</xsl:stylesheet>




