package com.sforce.soap.partner.wsc;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class EmailSyncEntity implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public EmailSyncEntity() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo getTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : conflictResolution of type {urn:partner.soap.sforce.com}EmailSyncConflictResolution
     * java type: com.sforce.soap.partner.wsc.EmailSyncConflictResolution
     */
    private boolean conflictResolution__is_set = false;

    private com.sforce.soap.partner.wsc.EmailSyncConflictResolution conflictResolution;

    public com.sforce.soap.partner.wsc.EmailSyncConflictResolution getConflictResolution() {
      return conflictResolution;
    }

    public void setConflictResolution(com.sforce.soap.partner.wsc.EmailSyncConflictResolution conflictResolution) {
      this.conflictResolution = conflictResolution;
      conflictResolution__is_set = true;
    }

    protected void setConflictResolution(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, getTypeInfo("conflictResolution", "urn:partner.soap.sforce.com","conflictResolution","urn:partner.soap.sforce.com","EmailSyncConflictResolution",1,1,true))) {
        setConflictResolution((com.sforce.soap.partner.wsc.EmailSyncConflictResolution)__typeMapper.readObject(__in, getTypeInfo("conflictResolution", "urn:partner.soap.sforce.com","conflictResolution","urn:partner.soap.sforce.com","EmailSyncConflictResolution",1,1,true), com.sforce.soap.partner.wsc.EmailSyncConflictResolution.class));
      }
    }

    protected void writeFieldConflictResolution(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("conflictResolution", "urn:partner.soap.sforce.com","conflictResolution","urn:partner.soap.sforce.com","EmailSyncConflictResolution",1,1,true), conflictResolution, conflictResolution__is_set);
    }

    /**
     * element : dataSetFilter of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean dataSetFilter__is_set = false;

    private java.lang.String dataSetFilter;

    public java.lang.String getDataSetFilter() {
      return dataSetFilter;
    }

    public void setDataSetFilter(java.lang.String dataSetFilter) {
      this.dataSetFilter = dataSetFilter;
      dataSetFilter__is_set = true;
    }

    protected void setDataSetFilter(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, getTypeInfo("dataSetFilter", "urn:partner.soap.sforce.com","dataSetFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDataSetFilter(__typeMapper.readString(__in, getTypeInfo("dataSetFilter", "urn:partner.soap.sforce.com","dataSetFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    protected void writeFieldDataSetFilter(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("dataSetFilter", "urn:partner.soap.sforce.com","dataSetFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true), dataSetFilter, dataSetFilter__is_set);
    }

    /**
     * element : fieldMapping of type {urn:partner.soap.sforce.com}EmailSyncFieldMapping
     * java type: com.sforce.soap.partner.wsc.EmailSyncFieldMapping[]
     */
    private boolean fieldMapping__is_set = false;

    private com.sforce.soap.partner.wsc.EmailSyncFieldMapping[] fieldMapping = new com.sforce.soap.partner.wsc.EmailSyncFieldMapping[0];

    public com.sforce.soap.partner.wsc.EmailSyncFieldMapping[] getFieldMapping() {
      return fieldMapping;
    }

    public void setFieldMapping(com.sforce.soap.partner.wsc.EmailSyncFieldMapping[] fieldMapping) {
      this.fieldMapping = fieldMapping;
      fieldMapping__is_set = true;
    }

    protected void setFieldMapping(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, getTypeInfo("fieldMapping", "urn:partner.soap.sforce.com","fieldMapping","urn:partner.soap.sforce.com","EmailSyncFieldMapping",0,-1,true))) {
        setFieldMapping((com.sforce.soap.partner.wsc.EmailSyncFieldMapping[])__typeMapper.readObject(__in, getTypeInfo("fieldMapping", "urn:partner.soap.sforce.com","fieldMapping","urn:partner.soap.sforce.com","EmailSyncFieldMapping",0,-1,true), com.sforce.soap.partner.wsc.EmailSyncFieldMapping[].class));
      }
    }

    protected void writeFieldFieldMapping(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("fieldMapping", "urn:partner.soap.sforce.com","fieldMapping","urn:partner.soap.sforce.com","EmailSyncFieldMapping",0,-1,true), fieldMapping, fieldMapping__is_set);
    }

    /**
     * element : matchPreference of type {urn:partner.soap.sforce.com}EmailSyncMatchPreference
     * java type: com.sforce.soap.partner.wsc.EmailSyncMatchPreference
     */
    private boolean matchPreference__is_set = false;

    private com.sforce.soap.partner.wsc.EmailSyncMatchPreference matchPreference;

    public com.sforce.soap.partner.wsc.EmailSyncMatchPreference getMatchPreference() {
      return matchPreference;
    }

    public void setMatchPreference(com.sforce.soap.partner.wsc.EmailSyncMatchPreference matchPreference) {
      this.matchPreference = matchPreference;
      matchPreference__is_set = true;
    }

    protected void setMatchPreference(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, getTypeInfo("matchPreference", "urn:partner.soap.sforce.com","matchPreference","urn:partner.soap.sforce.com","EmailSyncMatchPreference",1,1,true))) {
        setMatchPreference((com.sforce.soap.partner.wsc.EmailSyncMatchPreference)__typeMapper.readObject(__in, getTypeInfo("matchPreference", "urn:partner.soap.sforce.com","matchPreference","urn:partner.soap.sforce.com","EmailSyncMatchPreference",1,1,true), com.sforce.soap.partner.wsc.EmailSyncMatchPreference.class));
      }
    }

    protected void writeFieldMatchPreference(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("matchPreference", "urn:partner.soap.sforce.com","matchPreference","urn:partner.soap.sforce.com","EmailSyncMatchPreference",1,1,true), matchPreference, matchPreference__is_set);
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, getTypeInfo("name", "urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, getTypeInfo("name", "urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    protected void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("name", "urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
    }

    /**
     * element : recordTypeId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean recordTypeId__is_set = false;

    private java.lang.String recordTypeId;

    public java.lang.String getRecordTypeId() {
      return recordTypeId;
    }

    public void setRecordTypeId(java.lang.String recordTypeId) {
      this.recordTypeId = recordTypeId;
      recordTypeId__is_set = true;
    }

    protected void setRecordTypeId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, getTypeInfo("recordTypeId", "urn:partner.soap.sforce.com","recordTypeId","urn:partner.soap.sforce.com","ID",1,1,true))) {
        setRecordTypeId(__typeMapper.readString(__in, getTypeInfo("recordTypeId", "urn:partner.soap.sforce.com","recordTypeId","urn:partner.soap.sforce.com","ID",1,1,true), java.lang.String.class));
      }
    }

    protected void writeFieldRecordTypeId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("recordTypeId", "urn:partner.soap.sforce.com","recordTypeId","urn:partner.soap.sforce.com","ID",1,1,true), recordTypeId, recordTypeId__is_set);
    }

    /**
     * element : syncDirection of type {urn:partner.soap.sforce.com}EmailSyncDirection
     * java type: com.sforce.soap.partner.wsc.EmailSyncDirection
     */
    private boolean syncDirection__is_set = false;

    private com.sforce.soap.partner.wsc.EmailSyncDirection syncDirection;

    public com.sforce.soap.partner.wsc.EmailSyncDirection getSyncDirection() {
      return syncDirection;
    }

    public void setSyncDirection(com.sforce.soap.partner.wsc.EmailSyncDirection syncDirection) {
      this.syncDirection = syncDirection;
      syncDirection__is_set = true;
    }

    protected void setSyncDirection(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, getTypeInfo("syncDirection", "urn:partner.soap.sforce.com","syncDirection","urn:partner.soap.sforce.com","EmailSyncDirection",1,1,true))) {
        setSyncDirection((com.sforce.soap.partner.wsc.EmailSyncDirection)__typeMapper.readObject(__in, getTypeInfo("syncDirection", "urn:partner.soap.sforce.com","syncDirection","urn:partner.soap.sforce.com","EmailSyncDirection",1,1,true), com.sforce.soap.partner.wsc.EmailSyncDirection.class));
      }
    }

    protected void writeFieldSyncDirection(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("syncDirection", "urn:partner.soap.sforce.com","syncDirection","urn:partner.soap.sforce.com","EmailSyncDirection",1,1,true), syncDirection, syncDirection__is_set);
    }

    /**
     * element : syncFollowed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean syncFollowed__is_set = false;

    private boolean syncFollowed;

    public boolean getSyncFollowed() {
      return syncFollowed;
    }

    public boolean isSyncFollowed() {
      return syncFollowed;
    }

    public void setSyncFollowed(boolean syncFollowed) {
      this.syncFollowed = syncFollowed;
      syncFollowed__is_set = true;
    }

    protected void setSyncFollowed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, getTypeInfo("syncFollowed", "urn:partner.soap.sforce.com","syncFollowed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setSyncFollowed(__typeMapper.readBoolean(__in, getTypeInfo("syncFollowed", "urn:partner.soap.sforce.com","syncFollowed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    protected void writeFieldSyncFollowed(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, getTypeInfo("syncFollowed", "urn:partner.soap.sforce.com","syncFollowed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), syncFollowed, syncFollowed__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       writeFieldConflictResolution(__out, __typeMapper);
       writeFieldDataSetFilter(__out, __typeMapper);
       writeFieldFieldMapping(__out, __typeMapper);
       writeFieldMatchPreference(__out, __typeMapper);
       writeFieldName(__out, __typeMapper);
       writeFieldRecordTypeId(__out, __typeMapper);
       writeFieldSyncDirection(__out, __typeMapper);
       writeFieldSyncFollowed(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        setConflictResolution(__in, __typeMapper);
        setDataSetFilter(__in, __typeMapper);
        setFieldMapping(__in, __typeMapper);
        setMatchPreference(__in, __typeMapper);
        setName(__in, __typeMapper);
        setRecordTypeId(__in, __typeMapper);
        setSyncDirection(__in, __typeMapper);
        setSyncFollowed(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[EmailSyncEntity ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "conflictResolution", conflictResolution);
      toStringHelper(sb, "dataSetFilter", dataSetFilter);
      toStringHelper(sb, "fieldMapping", fieldMapping);
      toStringHelper(sb, "matchPreference", matchPreference);
      toStringHelper(sb, "name", name);
      toStringHelper(sb, "recordTypeId", recordTypeId);
      toStringHelper(sb, "syncDirection", syncDirection);
      toStringHelper(sb, "syncFollowed", syncFollowed);

    }


    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

}
