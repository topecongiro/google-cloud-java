// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface VideoAnnotationResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.VideoAnnotationResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  java.lang.String getInputUri();
  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   */
  com.google.protobuf.ByteString getInputUriBytes();

  /**
   *
   *
   * <pre>
   * Topical label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.LabelAnnotation>
      getSegmentLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Topical label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelAnnotation getSegmentLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Topical label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  int getSegmentLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Topical label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.LabelAnnotationOrBuilder>
      getSegmentLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Topical label annotations on video level or user specified segment level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.LabelAnnotation segment_label_annotations = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelAnnotationOrBuilder
      getSegmentLabelAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.LabelAnnotation>
      getShotLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelAnnotation getShotLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  int getShotLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.LabelAnnotationOrBuilder>
      getShotLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Topical label annotations on shot level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation shot_label_annotations = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelAnnotationOrBuilder getShotLabelAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.LabelAnnotation>
      getFrameLabelAnnotationsList();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelAnnotation getFrameLabelAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  int getFrameLabelAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.LabelAnnotationOrBuilder>
      getFrameLabelAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Label annotations on frame level.
   * There is exactly one element for each unique label.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.LabelAnnotation frame_label_annotations = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelAnnotationOrBuilder getFrameLabelAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment shot_annotations = 6;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.VideoSegment> getShotAnnotationsList();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment shot_annotations = 6;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegment getShotAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment shot_annotations = 6;</code>
   */
  int getShotAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment shot_annotations = 6;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder>
      getShotAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Shot annotations. Each shot is represented as a video segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment shot_annotations = 6;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getShotAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  boolean hasExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentAnnotation getExplicitAnnotation();
  /**
   *
   *
   * <pre>
   * Explicit content annotation.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ExplicitContentAnnotation explicit_annotation = 7;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentAnnotationOrBuilder
      getExplicitAnnotationOrBuilder();

  /**
   *
   *
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.SpeechTranscription speech_transcriptions = 11;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.SpeechTranscription>
      getSpeechTranscriptionsList();
  /**
   *
   *
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.SpeechTranscription speech_transcriptions = 11;
   * </code>
   */
  com.google.cloud.videointelligence.v1.SpeechTranscription getSpeechTranscriptions(int index);
  /**
   *
   *
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.SpeechTranscription speech_transcriptions = 11;
   * </code>
   */
  int getSpeechTranscriptionsCount();
  /**
   *
   *
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.SpeechTranscription speech_transcriptions = 11;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.SpeechTranscriptionOrBuilder>
      getSpeechTranscriptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.SpeechTranscription speech_transcriptions = 11;
   * </code>
   */
  com.google.cloud.videointelligence.v1.SpeechTranscriptionOrBuilder
      getSpeechTranscriptionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextAnnotation text_annotations = 12;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.TextAnnotation> getTextAnnotationsList();
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextAnnotation text_annotations = 12;</code>
   */
  com.google.cloud.videointelligence.v1.TextAnnotation getTextAnnotations(int index);
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextAnnotation text_annotations = 12;</code>
   */
  int getTextAnnotationsCount();
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextAnnotation text_annotations = 12;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.TextAnnotationOrBuilder>
      getTextAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * OCR text detection and tracking.
   * Annotations for list of detected text snippets. Each will have list of
   * frame information associated with it.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextAnnotation text_annotations = 12;</code>
   */
  com.google.cloud.videointelligence.v1.TextAnnotationOrBuilder getTextAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.ObjectTrackingAnnotation>
      getObjectAnnotationsList();
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ObjectTrackingAnnotation getObjectAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  int getObjectAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.ObjectTrackingAnnotationOrBuilder>
      getObjectAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Annotations for list of objects detected and tracked in video.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.ObjectTrackingAnnotation object_annotations = 14;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ObjectTrackingAnnotationOrBuilder
      getObjectAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
   * some videos may succeed and some may fail.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
