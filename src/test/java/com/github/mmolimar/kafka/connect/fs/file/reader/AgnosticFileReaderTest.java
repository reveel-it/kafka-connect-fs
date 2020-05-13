package com.github.mmolimar.kafka.connect.fs.file.reader;

import org.junit.jupiter.api.Nested;

import java.util.Map;

public class AgnosticFileReaderTest {

    private static final String FILE_EXTENSION = "test";

    @Nested
    class AgnosticTextFileReaderTest extends TextFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_TEXT, getFileExtension());
            return config;
        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

    @Nested
    class AgnosticCsvFileReaderTest extends CsvFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_CSV, getFileExtension());
            return config;
        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

    @Nested
    class AgnosticTsvFileReaderTest extends TsvFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_TSV, getFileExtension());
            return config;
        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

    @Nested
    class AgnosticFixedWidthFileReaderTest extends FixedWidthFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_FIXED, getFileExtension());
            return config;
        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

    @Nested
    class AgnosticJsonFileReaderTest extends JsonFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_JSON, getFileExtension());
            return config;
        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

    @Nested
    class AgnosticAvroFileReaderTest extends AvroFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_AVRO, getFileExtension());
            return config;
        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

    @Nested
    class AgnosticSequenceFileReaderTest extends SequenceFileReaderTest {

        @Override
        protected Map<String, Object> getReaderConfig() {
            Map<String, Object> config = super.getReaderConfig();
            config.put(AgnosticFileReader.FILE_READER_AGNOSTIC_EXTENSIONS_SEQUENCE, getFileExtension());
            return config;
        }

        @Override
        public void schemaMapper(ReaderFsTestConfig fsConfig) {

        }

        @Override
        public Class<? extends FileReader> getReaderClass() {
            return AgnosticFileReader.class;
        }

        @Override
        public String getFileExtension() {
            return FILE_EXTENSION;
        }
    }

}
