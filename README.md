# xslt
xslt Translation (xml to Json)
Translator.Java file uses supporting .xsl files for converting .xml file to the .json.
It requires library :  Saxon-B-9.0.jar for the convertion. 

Supporting .xslt files:
skip_replace_tags - selective tags can be skipped or replaced with new name. 
xml_to_json - this runs after replace to convert the xml to json. 

products.xml - original file (first input) 
tags_replaced.xml - xml output after replaced or filtering tags

products_in_json_format - final json file with required/renamed tags. 

