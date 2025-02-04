name := "smile-core"

packageOptions += Package.ManifestAttributes("Automatic-Module-Name" -> "smile.core")

libraryDependencies ++= Seq(
  "org.bytedeco" % "javacpp"   % "1.5.8"        % "provided" classifier "macosx-x86_64" classifier "windows-x86_64" classifier "linux-x86_64",
  "org.bytedeco" % "openblas"  % "0.3.21-1.5.8" % "provided" classifier "macosx-x86_64" classifier "windows-x86_64" classifier "linux-x86_64",
  "org.bytedeco" % "arpack-ng" % "3.8.0-1.5.8"  % "provided" classifier "macosx-x86_64" classifier "windows-x86_64" classifier "linux-x86_64" classifier ""
)
